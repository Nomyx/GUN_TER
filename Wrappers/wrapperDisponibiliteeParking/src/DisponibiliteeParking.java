import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;
import org.jdom2.util.IteratorIterable;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;


public class DisponibiliteeParking {

	private static final String file = "../../DataSets/disponibilite-dans-les-parkings-publics-de-nantes-metropole.xml";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//TODO: revoir algorithme pour prendre n balises
		
		//entête du fichier RDF Turtle
		Model DispoParkingModel = ModelFactory.createDefaultModel();
		String nsA = "http://example.org/";
		String nsB = "http://example.org/Parking_availability/";
		String nsC = "http://example.org/Parking_status/";
		String nsD = "http://example.org/Parking/";
		
		DispoParkingModel.setNsPrefix("schema", nsA);
		DispoParkingModel.setNsPrefix("parking_availability", nsB);
		DispoParkingModel.setNsPrefix("parking_status", nsC);
		DispoParkingModel.setNsPrefix("parking", nsD);
		
		Map<String, Property> properties_available = new HashMap<String, Property>();
		properties_available.put("Grp_identifiant", DispoParkingModel.createProperty(nsB + "id"));
		properties_available.put("Grp_nom", DispoParkingModel.createProperty(nsB + "name"));
		properties_available.put("Grp_statut", DispoParkingModel.createProperty(nsB + "statut"));
		properties_available.put("Grp_pri_aut", DispoParkingModel.createProperty(nsB + "priority"));
		properties_available.put("Grp_disponible", DispoParkingModel.createProperty(nsB + "space"));
		properties_available.put("Grp_complet", DispoParkingModel.createProperty(nsB + "complete"));
		properties_available.put("Grp_exploitation", DispoParkingModel.createProperty(nsB + "exploitation"));
		properties_available.put("Grp_horodatage", DispoParkingModel.createProperty(nsB + "timestamp"));
		properties_available.put("IdObj", DispoParkingModel.createProperty(nsB + "IdObj"));
		
		Resource status0 = DispoParkingModel.createResource(nsC + "0");
		Resource status1 = DispoParkingModel.createResource(nsC + "1");
		Resource status2 = DispoParkingModel.createResource(nsC + "2");
		Resource status5 = DispoParkingModel.createResource(nsC + "5");
		
		DispoParkingModel.add(status0, DispoParkingModel.createProperty(nsC + "id"), "0");
		DispoParkingModel.add(status0, DispoParkingModel.createProperty(nsC + "description"), "Invalide (comptage hors service)");
		DispoParkingModel.add(status0, DispoParkingModel.createProperty(nsC + "pjdPrint"), "Neutre (affichage au noir)");
		
		DispoParkingModel.add(status1, DispoParkingModel.createProperty(nsC + "id"), "1");
		DispoParkingModel.add(status1, DispoParkingModel.createProperty(nsC + "description"), "Groupe parking fermé pour tous clients ");
		DispoParkingModel.add(status1, DispoParkingModel.createProperty(nsC + "pjdPrint"), "FERME");
		
		DispoParkingModel.add(status2, DispoParkingModel.createProperty(nsC + "id"), "2");
		DispoParkingModel.add(status2, DispoParkingModel.createProperty(nsC + "description"), "Groupe parking fermé au client horaires et ouvert pour les abonnés (exemple : un parking fermé aux clients horaires la nuit ou le dimanche)");
		DispoParkingModel.add(status2, DispoParkingModel.createProperty(nsC + "pjdPrint"), "ABONNES");
		
		DispoParkingModel.add(status5, DispoParkingModel.createProperty(nsC + "id"), "5");
		DispoParkingModel.add(status5, DispoParkingModel.createProperty(nsC + "description"), "Groupe parking ouvert à tous les clients. Le nombre de places correspond au nombre de places destinées aux clients horaires");
		DispoParkingModel.add(status5, DispoParkingModel.createProperty(nsC + "pjdPrint"), "#Nombre de places# ou COMPLET");


		
		//Parsing xml file
		
		SAXBuilder builder = new SAXBuilder();
		
		try {
			Document document = builder.build(file);
			Element rootNode = document.getRootElement();
			IteratorIterable<Element> grpParkingIterator = rootNode.getDescendants(new ElementFilter("Groupe_Parking"));
			Element encours = grpParkingIterator.next();
			while(grpParkingIterator.hasNext()){
				if(encours.getChild("Groupe_Parking") == null){
					Resource r = DispoParkingModel.createResource(nsB + encours.getChild("Grp_identifiant").getValue());
					
					DispoParkingModel.add(r, properties_available.get("Grp_identifiant"), encours.getChild("Grp_identifiant").getValue());
					DispoParkingModel.add(r, properties_available.get("Grp_nom"), encours.getChild("Grp_nom").getValue());
					DispoParkingModel.add(r, properties_available.get("Grp_identifiant"), encours.getChild("Grp_identifiant").getValue());
					
					Resource status = null;
					switch (Integer.valueOf(encours.getChild("Grp_statut").getValue())) {
					case 0:
						status = status0;
						break;
						
					case 1:
						status = status1;
						break;
						
					case 2:
						status = status2;
						break;
						
					case 5:
						status = status5;
						break;

					default:
						break;
					}
					
					DispoParkingModel.add(r, properties_available.get("Grp_statut"), status);
					DispoParkingModel.add(r, properties_available.get("Grp_pri_aut"), encours.getChild("Grp_pri_aut").getValue());
					DispoParkingModel.add(r, properties_available.get("Grp_disponible"), encours.getChild("Grp_disponible").getValue());
					DispoParkingModel.add(r, properties_available.get("Grp_complet"), encours.getChild("Grp_complet").getValue());
					DispoParkingModel.add(r, properties_available.get("Grp_exploitation"), encours.getChild("Grp_exploitation").getValue());
					DispoParkingModel.add(r, properties_available.get("Grp_horodatage"), encours.getChild("Grp_horodatage").getValue());
					DispoParkingModel.add(r, properties_available.get("IdObj"), encours.getChild("IdObj").getValue());
					//creer une ressource pour chaque valeur
						//pour le status faire une ressource sur un status qui utilise les propriétées pour accéder à ses éléments
				}
				encours = grpParkingIterator.next();
			}
			
			//			Element grpParkingElement = rootNode.get;
//			boolean find = false;
//			while(!find && true/*remplacer par fin de fichier*/){
//				//parcourir le fichier jusqu'a obtenir le premier group parking
//				
//			}
			
//			for(Element e : rootNode.getChildren("Groupe_Parking")){
//				System.out.println(e.getName());
//				for(Element f : e.getChildren()){
//					System.out.println(f.getName() + " : " + f.getText());
//				}
//			}
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DispoParkingModel.write(System.out, "TURTLE");
	}
}

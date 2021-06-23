import java.util.*;
import java.lang.*;
import java.io.*;

class LabelGenerator
{
	public static void main (String[] args) throws java.lang.Exception
	{

        ArrayList<Folder> folders = new ArrayList<>();
        folders.add(new Folder(1, "Inbox", 0));
        folders.add(new Folder(2, "Subfolder", 1));
        folders.add(new Folder(3, "Subfolder1", 2));
        folders.add(new Folder(4, "Subfolder2", 1));
        
        LabelGenerator lg = new LabelGenerator();
        
        System.out.println(lg.generateLabels(folders));
	}
	
	public ArrayList<String> generateLabels(List<Folder> folders) {
	    
	    HashMap<Integer, Folder> folderIdMap = new HashMap<>();
	    ArrayList<String> labels = new ArrayList();
	    
	    //Sort the Folders by id
	    Folder curr = null;
	    for(int i = 0; i < folders.size(); i ++) {
	        
	        curr = folders.get(i);
            folderIdMap.put(curr.id, curr);

	        if(curr.parentId == 0){
	            
	            labels.add(curr.name);
	        }
	        else {
	         
	            StringBuffer buffer = new StringBuffer(curr.name);
	            
	            while(curr.parentId > 0) {
	                
	                curr = folderIdMap.get(curr.parentId);
                    
	                buffer.insert(0, curr.name + "/");
	            }
	            labels.add(buffer.toString());
	        }
	    }
	    
	    return labels;
	}
	
	
	private static class Folder {
	    
	    int id;
	    String name;
	    int parentId;
	    
	    Folder(int id, String name, int parentId) {
	        
	        this.id = id;
	        this.name = name;
	        this.parentId = parentId;
	    }
	}
}

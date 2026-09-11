import java.util.ArrayList;
import java.util.Iterator;

public class Folder {
    private String folderName;
    private ArrayList<Folder> folders;
    private ArrayList<File> files;
    public Folder(String folderName){
        this.folderName = folderName;
        folders = new ArrayList<Folder>();
        files = new ArrayList<File>();
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }
    public ArrayList<File> getFiles(){
        return files;
    }
    public void addFile(File file){
        files.add(file);
    }
    public void addFolder(Folder folder){
        folders.add(folder);
    }
    public void deleteFolder(){
        Iterator<Folder> iterator = folders.iterator();     //iterator helps with the full recursion and prevents exception
        while(iterator.hasNext()){
            Folder sub = iterator.next();
            sub.deleteFolder();
            iterator.remove();
        }
        while(!(files.isEmpty())){
            files.removeFirst();
        }

    }
    public void printFolder(){
        System.out.println(folderName);
        for (Folder folder : folders) {
            folder.printFolder();
        }
        for (File file: files){
            file.print();
        }
    }

}

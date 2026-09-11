public class File {
    private String fileName;
    public File(String filename){
        this.fileName = filename;
    }
    public String getFileName(){
        return fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void print(){
        System.out.println(fileName);
    }
}

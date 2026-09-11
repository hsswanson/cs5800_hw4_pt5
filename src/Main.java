//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("cs5800_hw4_pt5"));

    Folder demo1 = new Folder("demo1");

    Folder newFolder = new Folder("Include Path");
    demo1.addFolder(newFolder);
    newFolder = new Folder("Remote Files");
    demo1.addFolder(newFolder);
    newFolder = new Folder("Source Files");
    demo1.addFolder(newFolder);

    Folder focusFolder = newFolder; //set focus to Source

    newFolder = new Folder(".phalcon");
    focusFolder.addFolder(newFolder);
    newFolder = new Folder("cache");
    focusFolder.addFolder(newFolder);
    newFolder = new Folder("public");
    Folder deleteFolder2 = newFolder;
    newFolder.addFile(new File(".htaccess"));
    newFolder.addFile(new File(".htrouter.php"));
    newFolder.addFile(new File("index.html"));
    focusFolder.addFolder(newFolder);

    newFolder = new Folder("app");
    Folder deleteFolder1 = newFolder;
    newFolder.addFolder(new Folder("config"));
    newFolder.addFolder(new Folder("controllers"));
    newFolder.addFolder(new Folder("library"));
    newFolder.addFolder(new Folder("migrations"));
    newFolder.addFolder(new Folder("models"));
    newFolder.addFolder(new Folder("views"));
    focusFolder.addFolder(newFolder);


    demo1.printFolder();

    System.out.println("*** Deleting app ***");
    focusFolder.getFolders().get(focusFolder.getFolders().indexOf(deleteFolder1)).deleteFolder();
    focusFolder.getFolders().remove(deleteFolder1);

    demo1.printFolder();

    System.out.println("*** Deleting public ***");
    focusFolder.getFolders().get(focusFolder.getFolders().indexOf(deleteFolder2)).deleteFolder();
    focusFolder.getFolders().remove(deleteFolder2);

    demo1.printFolder();


}

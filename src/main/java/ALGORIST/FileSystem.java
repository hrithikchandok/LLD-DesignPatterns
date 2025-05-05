package ALGORIST;

import java.util.Arrays;
import java.util.HashMap;
// Trie DataStructure
class Folder{
    String name;
    int val;
    HashMap<String,Folder> subFolders;
    Folder(String name, int val){
        this.name = name;
        this.val = val;
        subFolders = new HashMap<>();
    }
}
public class FileSystem {
    Folder root;
    FileSystem(){
        root=new Folder("root",-1);
    }
    boolean createPath(String path, int val){
        String temp[]=path.split("/");
        int n=temp.length;
        System.out.println(Arrays.toString(temp));
        Folder currFolder=root;
        for(int i=1;i<n;i++){
             if(!currFolder.subFolders.containsKey(temp[i])&&i==n-1){

                    currFolder.subFolders.put(temp[i],new Folder(temp[i],val));
            }
            else if(!currFolder.subFolders.containsKey(temp[i])){return false;}
            currFolder=currFolder.subFolders.get(temp[i]);
        }
        return true;
    }
    int get(String path){
        String temp[]=path.split("/");
        int n=temp.length;
        Folder currFolder=root;
        for(int i=1;i<n;i++){
            if(!currFolder.subFolders.containsKey(temp[i])){
                return -1;
            }
            else
                currFolder=currFolder.subFolders.get(temp[i]);
        }
        return currFolder.val;
    }
    public static void main(String[] args){
        FileSystem fs=new FileSystem();
        boolean temp=fs.createPath("/users",100);
        boolean path = fs.createPath("/users/desktop", 2);
        System.out.println("get of '/users/desktop'"+fs.get("/users/desktop"));
        System.out.println("get of '/c/d'"+fs.get("/c/d"));
        fs.createPath("/c/d",11);
        fs.createPath("/c",2);
        System.out.println("get of '/c/d'"+fs.get("/c/d"));
        System.out.println("get of '/c'"+fs.get("/c"));
        System.out.println(temp+"  "+path);


    }
}

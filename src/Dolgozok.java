import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dolgozok {
    public void setDolgozoArrayList(ArrayList<Dolgozo> dolgozoArrayList) {
        this.dolgozoArrayList = dolgozoArrayList;
    }

    public ArrayList<Dolgozo> dolgozoArrayList = new ArrayList<>();
    public Dolgozok(){
        try {
            FileReader fr = new FileReader("adatok.txt");
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while(sor!= null){
                String [] adatok = sor.split("\\s+");
                String vezetekn = adatok[0];
                String keresztnev = adatok[1];
                String nem = adatok[2];
                int eletkor = Integer.parseInt(adatok[3]);
                int fizetes = Integer.parseInt(adatok[4]);
                Dolgozo d = new Dolgozo(vezetekn,keresztnev,nem,eletkor,fizetes);
                dolgozoArrayList.add(d);
                sor = br.readLine();

            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public int HarmasFeladat(){
        return dolgozoArrayList.size();
    }
    public int NegyesFeladat(){
        int db = 0;
        for (Dolgozo d : dolgozoArrayList
             ) {
            if (d.getEletkor()< 25){
                db+=d.getFizetes();
            }
        }
        return db;
    }
    public String OtosFeladat(){
        String s = "Legtöbbet kereső alkalmazott adatai: ";
        int max = 0;
        String nev ="";
        int kor = 0;
        String nem="";
        for (Dolgozo d: dolgozoArrayList
             ) {
            if (d.getFizetes()>max){
                max = d.getFizetes();
                nev = d.getVezetekn() +" "+ d.getKeresztn();
                kor = d.getEletkor();
                nem = d.getNem();
            }
        }
        s += nev.toString()+"\n "+ kor +" éves \n"+ nem+" \n"+max ;
        return s;

    }
    public boolean HatodikFeladat(int fizetes){
        if (fizetes > 0 ){
            boolean szerepel = false;
            for (Dolgozo d : dolgozoArrayList) {
                if (d.getFizetes() > fizetes) {
                    szerepel = true;
                }
            }
            return szerepel;
        }
        return false;
    }




}

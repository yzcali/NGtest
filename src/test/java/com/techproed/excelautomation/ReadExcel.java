package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;


@Test
public class ReadExcel {
    public void test() throws IOException {

   String filePath="C:\\Users\\yzc\\IdeaProjects\\TestNGProje\\src\\test\\resources\\ULKELER.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filePath);

        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheetAt(0);// sayfa 1_ bu 0 index te
        Row row = sheet.getRow(6);
        Cell country= row.getCell(0);
        Cell cityCenter= row.getCell(1);//baskentler
        Cell popular= row.getCell(2);
        System.out.println(cityCenter);

        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));//Arjantin
        System.out.println(workbook.getSheetAt(0).getRow(6).getCell(1));//paris

        // Son satır(Row)'ın numarasını almak için (indexini, index 0 dan başlar)
        int satirSayisi = workbook.getSheetAt(0).getLastRowNum()+1;
        System.out.println("Satır sayısı : " + satirSayisi);//14

        //icerisinde veri olan satir sayisini almak isterseniz
        int doluSatirSayisi= workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu Satir sayisi:"+ doluSatirSayisi);//12

        // tum ulkeleri yazdirmak icin
         int sonSatirinIndexi= workbook.getSheetAt(0).getLastRowNum();
        for(int i=0; i<=sonSatirinIndexi; i++) {
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));

            // tum baskentler
            //for (int k = 0; k < sonSatirinIndexi; k++) {
            //    System.out.println(workbook.getSheetAt(0).getRow(k).getCell(1));

            }
             // bir satirin son sutununun index ini almak icin
            int sonSutunSayisi= workbook.getSheetAt(0).getRow(0).getLastCellNum();
            System.out.println("son cell Index:"+sonSutunSayisi);//3

             for(int j=0; j<sonSutunSayisi;j++) {
                 System.out.println(workbook.getSheetAt(0).getRow(3).getCell(j));

                 for (int i = 0; i < sonSatirinIndexi; i++) {
                     for (int m = 0; m < sonSutunSayisi; m++) {
                         System.out.print(workbook.getSheetAt(0).getRow(i).getCell(m) + "-");
                     }
                     System.out.println("");

                 }


                 fileInputStream.close();

                 workbook.close();
             }}}




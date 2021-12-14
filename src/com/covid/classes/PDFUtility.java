/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.covid.classes;

import com.itextpdf.text.Image;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.itextpdf.layout.element.List;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.*;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Aditya
 */
public class PDFUtility {

    public static void generateCertificate(String Fname, String cid, String ref, String Lname, String age, String DoctorName, String DOB, String Centername, String Dtype, String Idno, String Gender, String Vaccinename, String SDose, String VStatus, String Vccintedat, String coundtry) {
        try {

            String filepath = "C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\images\\diploma (1).png";
            String filepath1 = "C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\CertificateQr\\" + ref + ".png";
            String filepath2 = "C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\images\\DSC_0853-1024x978.jpg";
            try {
                String qrCodeData = "Final Certificate for COVID-19 Vaccination\n"
                        + "Name	" + Fname + "" + "" + Lname + "\n"
                        + "Age	" + age + "\n"
                        + "DOB	" + DOB + "\n"
                        + "Gender  " + Gender + "\n"
                        + "Certificate ID    " + cid + "\n"
                        + "Vaccine Name	  " + Vaccinename + "\n"
                        + "Date of 2nd Dose	" + SDose + "\n"
                        + "Vaccination Status	" + VStatus + "\n"
                        + "Vaccination at	" + Vccintedat + "\n"
                        + "Country of Vaccination	" + coundtry + "";
                String filePath = "C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\CertificateQr\\" + ref + ".png";
                String charset = "UTF-8";
                Map< EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel>();
                hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
                BitMatrix matrix = new MultiFormatWriter().encode(
                        new String(qrCodeData.getBytes(charset), charset),
                        BarcodeFormat.QR_CODE, 200, 200, hintMap);
                MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                        .lastIndexOf('.') + 1), new File(filePath));
                File f = new File("C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\CertificateQr\\" + ref + ".png");

            } catch (Exception e) {
                System.err.println(e);
            }
            Document d = new Document(PageSize.A4);
            Font[] fonts = {
                new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD, new BaseColor(0, 0, 0)),
                new Font(Font.FontFamily.COURIER, 12, Font.BOLD, new BaseColor(0, 0, 255)),
                new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD, new BaseColor(0, 0, 0)),
                new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL, new BaseColor(0, 0, 0)),
                new Font(Font.FontFamily.COURIER, 18, Font.BOLD, new BaseColor(0, 0, 255))};
            PdfWriter.getInstance(d, new FileOutputStream("C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\Certificate\\" + ref + ".pdf"));
            d.open();
            Cell c = new Cell();
            Paragraph p = new Paragraph();

            List list = new List();
            PdfPTable pt = new PdfPTable(6);
            pt.setWidthPercentage(98);
            PdfPCell img = new PdfPCell(Image.getInstance(filepath));
            PdfPCell title = new PdfPCell(new Paragraph("Certificate for COVID-19 Vaccination", fonts[4]));
            PdfPCell cidCell = new PdfPCell(new Paragraph("Certificate ID: " + cid + "", fonts[0]));
            PdfPCell BD = new PdfPCell(new Paragraph("Beneficiary Details", fonts[1]));
            PdfPCell BD1 = new PdfPCell(new Paragraph("   "));
            PdfPCell c1 = new PdfPCell(new Paragraph("Beneficiary Name: ", fonts[2]));
            PdfPCell c2 = new PdfPCell(new Paragraph(Fname + " " + Lname, fonts[3]));
            PdfPCell c3 = new PdfPCell(new Paragraph("Age :", fonts[2]));
            PdfPCell c4 = new PdfPCell(new Paragraph(age, fonts[3]));
            PdfPCell c5 = new PdfPCell(new Paragraph("Gender :", fonts[2]));
            PdfPCell c6 = new PdfPCell(new Paragraph(Gender, fonts[3]));
            PdfPCell c7 = new PdfPCell(new Paragraph("ID Verified :", fonts[2]));
            PdfPCell c8 = new PdfPCell(new Paragraph(Dtype + " #" + Idno, fonts[3]));
            PdfPCell c9 = new PdfPCell(new Paragraph("Beneficiary Reference ID :", fonts[2]));
            PdfPCell c10 = new PdfPCell(new Paragraph(ref, fonts[3]));
            PdfPCell c11 = new PdfPCell(new Paragraph("Vaccination Status :", fonts[2]));
            PdfPCell c12 = new PdfPCell(new Paragraph(VStatus, fonts[3]));
            PdfPCell VD = new PdfPCell(new Paragraph("Vaccination Details", fonts[1]));
            PdfPCell VD1 = new PdfPCell(new Paragraph("   "));
            PdfPCell c13 = new PdfPCell(new Paragraph("Vaccine Name :", fonts[2]));
            PdfPCell c14 = new PdfPCell(new Paragraph(Vaccinename, fonts[3]));
            PdfPCell c15 = new PdfPCell(new Paragraph("Dose Numbe :", fonts[2]));
            PdfPCell c16 = new PdfPCell(new Paragraph(VStatus, fonts[3]));
            PdfPCell c17 = new PdfPCell(new Paragraph("Date of Dose :", fonts[2]));
            PdfPCell c18 = new PdfPCell(new Paragraph(Vccintedat, fonts[3]));
            PdfPCell c19 = new PdfPCell(new Paragraph("Vaccinated By :", fonts[2]));
            PdfPCell c20 = new PdfPCell(new Paragraph(DoctorName, fonts[3]));
            PdfPCell c21 = new PdfPCell(new Paragraph("Vaccination At :", fonts[2]));
            PdfPCell c22 = new PdfPCell(new Paragraph(Centername, fonts[3]));
            PdfPCell img1 = new PdfPCell(Image.getInstance(filepath1));
            PdfPCell img2 = new PdfPCell(Image.getInstance(filepath2));

            img.setColspan(6);
            img.setPadding(2);
            img.setBorderWidth(00);
            img.setHorizontalAlignment(Element.ALIGN_CENTER);
            title.setColspan(6);
            title.setBorderWidth(00);
            title.setPadding(2);
            title.setHorizontalAlignment(Element.ALIGN_CENTER);
            cidCell.setColspan(6);
            cidCell.setBorderWidth(00);
            cidCell.setPadding(2);
            cidCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            BD.setColspan(2);
            BD.setBorderWidth(00);
            BD.setPadding(15);
            BD.setHorizontalAlignment(Element.ALIGN_CENTER);
            BD1.setColspan(4);
            BD1.setBorderWidth(00);
            BD1.setPadding(15);
            BD1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1.setColspan(2);
            c1.setBorderWidth(00);
            c1.setPadding(8);
            //c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c2.setColspan(4);
            c2.setBorderWidth(00);
            c2.setPadding(8);
            c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            c3.setColspan(2);
            c3.setBorderWidth(00);
            c3.setPadding(8);
            //c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            c4.setColspan(4);
            c4.setBorderWidth(00);
            c4.setPadding(8);
            c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            c5.setColspan(2);
            c5.setBorderWidth(00);
            c5.setPadding(8);
            //c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            c6.setColspan(4);
            c6.setBorderWidth(00);
            c6.setPadding(8);
            c6.setHorizontalAlignment(Element.ALIGN_CENTER);
            c7.setColspan(2);
            c7.setBorderWidth(00);
            c7.setPadding(8);
            //c7.setHorizontalAlignment(Element.ALIGN_CENTER);
            c8.setColspan(4);
            c8.setBorderWidth(00);
            c8.setPadding(8);
            c8.setHorizontalAlignment(Element.ALIGN_CENTER);
            c9.setColspan(2);
            c9.setBorderWidth(00);
            c9.setPadding(8);
            //c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            c10.setColspan(4);
            c10.setBorderWidth(00);
            c10.setPadding(8);
            c10.setHorizontalAlignment(Element.ALIGN_CENTER);
            c11.setColspan(2);
            c11.setBorderWidth(00);
            c11.setPadding(8);
            //c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            c12.setColspan(4);
            c12.setBorderWidth(00);
            c12.setPadding(8);
            c12.setHorizontalAlignment(Element.ALIGN_CENTER);
            VD.setColspan(2);
            VD.setBorderWidth(00);
            VD.setPadding(15);
            VD.setHorizontalAlignment(Element.ALIGN_CENTER);
            VD1.setColspan(4);
            VD1.setBorderWidth(00);
            VD1.setPadding(15);
            VD1.setHorizontalAlignment(Element.ALIGN_CENTER);
            c13.setColspan(2);
            c13.setBorderWidth(00);
            c13.setPadding(8);
            //c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            c14.setColspan(4);
            c14.setBorderWidth(00);
            c14.setPadding(8);
            c14.setHorizontalAlignment(Element.ALIGN_CENTER);
            c15.setColspan(2);
            c15.setBorderWidth(00);
            c15.setPadding(8);
            //c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            c16.setColspan(4);
            c16.setBorderWidth(00);
            c16.setPadding(8);
            c16.setHorizontalAlignment(Element.ALIGN_CENTER);
            c17.setColspan(2);
            c17.setBorderWidth(00);
            c17.setPadding(8);
            //c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            c18.setColspan(4);
            c18.setBorderWidth(00);
            c18.setPadding(8);
            c18.setHorizontalAlignment(Element.ALIGN_CENTER);
            c19.setColspan(2);
            c19.setBorderWidth(00);
            c19.setPadding(8);
            //c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            c20.setColspan(4);
            c20.setBorderWidth(00);
            c20.setPadding(8);
            c20.setHorizontalAlignment(Element.ALIGN_CENTER);
            c21.setColspan(2);
            c21.setBorderWidth(00);
            c21.setPadding(8);
            //c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            c22.setColspan(4);
            c22.setBorderWidth(00);
            c22.setPadding(8);
            c22.setHorizontalAlignment(Element.ALIGN_CENTER);
            img1.setColspan(3);
            img1.setPadding(15);
            img1.setHorizontalAlignment(Element.ALIGN_CENTER);
            img1.setBackgroundColor(BaseColor.GRAY);
            img2.setColspan(3);
            img2.setPadding(15);
            img2.setHorizontalAlignment(Element.ALIGN_CENTER);
            img1.setBackgroundColor(BaseColor.GRAY);
//            

            pt.addCell(img);
            pt.addCell(title);
            pt.addCell(cidCell);
            pt.addCell(BD);
            pt.addCell(BD1);
            pt.addCell(c1);
            pt.addCell(c2);
            pt.addCell(c3);
            pt.addCell(c4);
            pt.addCell(c5);
            pt.addCell(c6);
            pt.addCell(c7);
            pt.addCell(c8);
            pt.addCell(c9);
            pt.addCell(c10);
            pt.addCell(c11);
            pt.addCell(c12);
            pt.addCell(VD);
            pt.addCell(VD1);
            pt.addCell(c13);
            pt.addCell(c14);
            pt.addCell(c15);
            pt.addCell(c16);
            pt.addCell(c17);
            pt.addCell(c18);
            pt.addCell(c19);
            pt.addCell(c20);
            pt.addCell(c21);
            pt.addCell(c22);
            pt.addCell(img2);
            pt.addCell(img1);

            d.add(pt);
            d.add(p);
            d.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PDFUtility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PDFUtility.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(PDFUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void generatePdf(String rand, String center, String time, String name, String vaccinename, String Dosestatus, String dtype, String date) {
        try {
            try {
                String qrCodeData = "Refference id: " + rand + "\n" + "first name: " + name + "Vaccination Center: " + center + " And Vaccination Date: " + date;
                String filePath = "C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\QR\\" + rand + ".png";
                String charset = "UTF-8"; // or "ISO-8859-1"
                Map< EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel>();
                hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
                BitMatrix matrix = new MultiFormatWriter().encode(
                        new String(qrCodeData.getBytes(charset), charset),
                        BarcodeFormat.QR_CODE, 200, 200, hintMap);
                MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                        .lastIndexOf('.') + 1), new File(filePath));
                File f = new File("C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\QR\\" + rand + ".png");

            } catch (Exception e) {
                System.err.println(e);
            }
            Document d = new Document(PageSize.A4);
            Font[] fonts = {
                new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0)),
                new Font(Font.FontFamily.COURIER, 14, Font.BOLD, new BaseColor(255, 0, 0)),};
            PdfWriter.getInstance(d, new FileOutputStream("C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\Slips\\" + rand + ".pdf"));
            d.open();
            Cell c = new Cell();
            Paragraph p = new Paragraph();
            List list = new List();
            PdfPTable pt = new PdfPTable(6);
            pt.setWidthPercentage(95);
            String filePath = "C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\QR\\" + rand + ".png";
            PdfPCell cell1 = new PdfPCell(new Paragraph("COVID-19 Vaccination Appointment Details", fonts[1]));
            PdfPCell cell2 = new PdfPCell(new Paragraph("APPOINTMENT DETAILS"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Center", fonts[0]));
            PdfPCell cell4 = new PdfPCell(new Paragraph(center));
            PdfPCell cell5 = new PdfPCell(new Paragraph("Time", fonts[0]));
            PdfPCell cell6 = new PdfPCell(new Paragraph(time));
            PdfPCell cell7 = new PdfPCell(new Paragraph("     "));
            PdfPCell cell8 = new PdfPCell(new Paragraph("DETAILS OF INDIVIDUALS"));
            PdfPCell cell9 = new PdfPCell(new Paragraph("Reference Id ", fonts[0]));
            PdfPCell cell10 = new PdfPCell(new Paragraph(rand));
            PdfPCell cell11 = new PdfPCell(new Paragraph("Name", fonts[0]));
            PdfPCell cell12 = new PdfPCell(new Paragraph(name));
            PdfPCell cell13 = new PdfPCell(new Paragraph("Vaccine Name", fonts[0]));
            PdfPCell cell14 = new PdfPCell(new Paragraph(vaccinename));
            PdfPCell cell15 = new PdfPCell(new Paragraph("Dose Type", fonts[0]));
            PdfPCell cell16 = new PdfPCell(new Paragraph(Dosestatus));
            PdfPCell cell17 = new PdfPCell(new Paragraph("NamePhoto Id\n"
                    + "to Carry", fonts[0]));
            PdfPCell cell18 = new PdfPCell(new Paragraph(dtype));
            PdfPCell cell19 = new PdfPCell(new Paragraph("Secret Code", fonts[0]));
            PdfPCell cell20 = new PdfPCell(new Paragraph(rand));
            PdfPCell img = new PdfPCell(Image.getInstance(filePath));
            PdfPCell cell21 = new PdfPCell(new Paragraph("INSTRUCTIONS"));
            PdfPCell cell22 = new PdfPCell(new Paragraph("1.Please carry the registered mobile phone and the requisite documents, including appointment slip, the Photo ID card"
                    + "used for registration, Employment Certificate (HCW/FLW) etc. while visiting the vaccination center, for verification at the\n"
                    + "time of vaccination."));
            PdfPCell cell23 = new PdfPCell(new Paragraph("2.Please arrive at the vaccination center only 15 minutes before the scheduled time to avoid overcrowding."));
            PdfPCell cell24 = new PdfPCell(new Paragraph("3.Please follow COVID appropriate behaviour at the vaccination centers.\n"
                    + "a) Wear a mask.\n"
                    + "b) Maintain a distance of at least 2 meters from others.\n"
                    + "c) Follow the queue system maintained at the vaccination centers."));

            cell2.setColspan(6);
            cell2.setPadding(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell1.setColspan(6);
            cell1.setPadding(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setColspan(1);
            cell3.setPadding(8);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell4.setColspan(2);
            cell4.setPadding(8);
            cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell5.setColspan(1);
            cell5.setPadding(8);
            cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell6.setColspan(2);
            cell6.setPadding(2);
            cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell7.setColspan(6);
            cell7.setPadding(8);
            cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell8.setColspan(6);
            cell8.setPadding(8);
            cell8.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell8.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell9.setColspan(1);
            cell9.setPadding(8);
            cell9.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell10.setColspan(1);
            cell10.setPadding(8);
            cell10.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell11.setColspan(1);
            cell11.setPadding(8);
            cell11.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell12.setColspan(1);
            cell12.setPadding(8);
            cell12.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell13.setColspan(1);
            cell13.setPadding(8);
            cell13.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell14.setColspan(1);
            cell14.setPadding(8);
            cell14.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell15.setColspan(1);
            cell15.setPadding(8);
            cell15.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell16.setColspan(1);
            cell16.setPadding(8);
            cell16.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell17.setColspan(1);
            cell17.setPadding(8);
            cell17.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell18.setColspan(1);
            cell18.setPadding(8);
            cell18.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell19.setColspan(1);
            cell19.setPadding(8);
            cell19.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell20.setColspan(1);
            cell20.setPadding(8);
            cell20.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell21.setColspan(6);
            cell21.setPadding(8);
            cell21.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell21.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell22.setColspan(6);
            cell22.setPadding(8);
            cell22.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell23.setColspan(6);
            cell23.setPadding(8);
            cell23.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell24.setColspan(6);
            cell24.setPadding(8);
            cell24.setHorizontalAlignment(Element.ALIGN_CENTER);
            img.setColspan(6);
            img.setPadding(8);
            img.setHorizontalAlignment(Element.ALIGN_CENTER);
            pt.addCell(cell1);
            pt.addCell(cell2);
            pt.addCell(cell3);
            pt.addCell(cell4);
            pt.addCell(cell5);
            pt.addCell(cell6);
            pt.addCell(cell7);
            pt.addCell(cell8);
            pt.addCell(cell9);
            pt.addCell(cell10);
            pt.addCell(cell11);
            pt.addCell(cell12);
            pt.addCell(cell13);
            pt.addCell(cell14);
            pt.addCell(cell15);
            pt.addCell(cell16);
            pt.addCell(cell17);
            pt.addCell(cell18);
            pt.addCell(cell19);
            pt.addCell(cell20);
            pt.addCell(cell21);
            pt.addCell(cell22);
            pt.addCell(cell23);
            pt.addCell(cell24);
            pt.addCell(img);

            d.add(pt);
            d.add(p);
            d.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PDFUtility.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PDFUtility.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(PDFUtility.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

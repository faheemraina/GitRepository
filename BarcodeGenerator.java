package com.tango.charli;



import com.onbarcode.barcode.IBarcode;
import com.onbarcode.barcode.ISBN;
import com.onbarcode.barcode.Code128;
import com.onbarcode.barcode.Code39;
import com.onbarcode.barcode.EAN128;
import com.onbarcode.barcode.QRCode;

public class BarcodeGenerator {
	       public static void main(String[] args)
	       {
	           try
	           { 
	        	  // QRCode barcode= new QRCode();
	        	 //  ISBN  barcode = new ISBN();
	        	  Code128  barcode = new Code128();
	             //   barcode.setData("978047082122");
	        	 // barcode.setData("This is wwe Superatsr john cena..!@##$%^com.onbarcode.barcode.IBarcode.");
	        	   barcode.setData("Khalid yaqoob");
	        	 //  barcode.setX(2);
	               
	               // barcode.setY(60);
	                barcode.setBarcodeWidth(150);
	                barcode.setBarcodeHeight(80);
	               // barcode.setUom(IBarcode.UOM_PIXEL);

/*
	                //Generate barcode in Gif image format
	                barcode.setImageFormat(0);
	                barcode.drawBarcode("C://barcode-code39.gif");

	                //Generate barcode in JPEG image format
	                barcode.setImageFormat(1);
	                barcode.drawBarcode("C://barcode-code39.jpg");*/

	                
	              //  barcode.setLeftMargin(0);
	             //   barcode.setRightMargin(0);
	                barcode.drawBarcode("/home/faheem/Desktop/java-mauk1.png");

	                System.out.println("donee");
	           }
	           catch(Exception e)
	           {
	               e.printStackTrace();
	           }
	       }
	}



package com.dicom.service;

import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.io.DicomInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = Main.class.getClassLoader().getResourceAsStream("MRBRAIN.DCM");
            System.out.println("Hello world!");
            DicomInputStream dicomFileStream = new DicomInputStream(is);
            DicomObject dcnIbj = null;
            dcnIbj = dicomFileStream.getDicomObject();
            String modality = dcnIbj.getString(Tag.Modality);
            System.out.println("Modality: " + modality);

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
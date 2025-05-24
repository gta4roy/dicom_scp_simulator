package com.dicom.service;

import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.io.DicomInputStream;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class TestMain {
    @Test
    public void testDicomImageRead(){
        try {
            File dicomFile = new File("testdata/MRBRAIN.DCM");
            System.out.println("Hello world!");
            DicomInputStream dicomFileStream = new DicomInputStream(dicomFile);
            DicomObject dcnIbj = null;
            dcnIbj = dicomFileStream.getDicomObject();
            String modality = dcnIbj.getString(Tag.Modality);
            System.out.println("Modality: " + modality);

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}

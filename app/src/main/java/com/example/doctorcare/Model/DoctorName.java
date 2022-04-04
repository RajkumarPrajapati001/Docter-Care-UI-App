package com.example.doctorcare.Model;

import java.util.PrimitiveIterator;

public class DoctorName {
    private  int DoctorImage;
    private  String DoctorName,DoctorSpecialist,HospitalName;

    public DoctorName(int doctorImage, String doctorName, String doctorSpecialist, String hospitalName) {
        DoctorImage = doctorImage;
        DoctorName = doctorName;
        DoctorSpecialist = doctorSpecialist;
        HospitalName = hospitalName;
    }

    public int getDoctorImage() {
        return DoctorImage;
    }

    public void setDoctorImage(int doctorImage) {
        DoctorImage = doctorImage;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDoctorSpecialist() {
        return DoctorSpecialist;
    }

    public void setDoctorSpecialist(String doctorSpecialist) {
        DoctorSpecialist = doctorSpecialist;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }
}

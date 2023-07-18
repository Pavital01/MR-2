package org.example;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws FileNotFoundException, JRException {
        String name = "Vitali";
        String surname = "Pavlevici";
        //Файл шаблона
        InputStream input = new FileInputStream(new File("Template.jrxml"));

        //"Создание дизайна" нужен для компиляции
        JasperDesign jasperDesign = JRXmlLoader.load(input);

        //собственно компиляция
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        //Параметры
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("surname",surname);
        parameters.put("name","Vitali");
        parameters.put("dateBirth","03/07/2001");
        parameters.put("placeOfBirth","Balti");
        parameters.put("nationality","rus");
        parameters.put("education","superioare");
        parameters.put("university","USM");
        parameters.put("graduationDate","05/07/2023");
        parameters.put("visitTypeEducation","de zi");
        parameters.put("speciality","Informatica Aplicată");
        parameters.put("qualification","licenta");
        parameters.put("diplomaNr","12354");
        parameters.put("diplomaDate","05/07/2023");
        parameters.put("DateOfCompletion","18/07/2023");
        parameters.put("workExperience","1 year");
        parameters.put("workExperienceGeneral","1 year");
        parameters.put("workExperienceUninterrupted","1 year");
        parameters.put("lastWorkPlace","xxxxxxx");
        parameters.put("lastWorkPlaceProfession","xxxxxxx");
        parameters.put("dismissalDate","xxxxxxx");
        parameters.put("dismissalReasons","xxxxxxx");
        parameters.put("familyStatus","it's complicated");
        parameters.put("buletinSeria","B42");
        parameters.put("buletinNr","2005003145235");
        parameters.put("buletinEmitent","ASP");
        parameters.put("buletinData","01/08/2017");
        parameters.put("address","Decebal");
        parameters.put("telefon","+37369366328");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        JasperViewer.viewReport(jasperPrint);
    }

    class DataSetFor030133CUDM{
        String name;
        String surname;
        String dateBirth;
        String placeOfBirth;
        String nationality;
        String education;
        String university;
        String graduationDate;
        String visitTypeEducation;
        String speciality;
        String qualification;
        String diplomaNr;
        String diplomaDate;
        String DateOfCompletion;
        String workExperience;
        String workExperienceGeneral;
        String workExperienceUninterrupted;
        String lastWorkPlace;
        String lastWorkPlaceProfession;
        Date dismissalDate;
        String dismissalReasons;
        String familyStatus;

        //Состав семьи

        String buletinSeria;
        String buletinNr;
        String buletinEmitent;
        String buletinData;
        String address;
        String telefon;
        DataSetFor030133CUDM(){}

    }
}

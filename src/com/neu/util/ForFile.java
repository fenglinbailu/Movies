package com.neu.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

/** 
* @author Ϧ����-O
* @version 2016��7��8�� ����10:38:49 
*/
public class ForFile {
    //�����ļ�·��
    private static String path2 = "D://Java//log//";
    private static String path = "D://Java//log2//";
    //�ļ�·��+����
    private static String filenameTemp;
    private static String filenameTemp2;
    /**
     * �����ļ�
     * @param fileName  �ļ�����
     * @param filecontent   �ļ�����
     * @return  �Ƿ񴴽��ɹ����ɹ��򷵻�true
     */
    public static boolean createFile(String fileName,String filecontent){
        Boolean bool = false;
        filenameTemp = path+fileName+".txt";//�ļ�·��+����+�ļ�����
        filenameTemp2 = path2+fileName+".txt";//�ļ�·��+����+�ļ�����
        File file = new File(filenameTemp);
        try {
            //����ļ������ڣ��򴴽��µ��ļ�
            if(!file.exists()){
                file.createNewFile();
                bool = true;
                System.out.println("success create file,the file is "+filenameTemp);
                //�����ļ��ɹ���д�����ݵ��ļ���
                writeFileContent(filenameTemp, filecontent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bool;
    }
    
    /**
     * ���ļ���д������
     * @param filepath �ļ�·��������
     * @param newstr  д�������
     * @return
     * @throws IOException
     */
    public static boolean writeFileContent(String filepath,String newstr) throws IOException{
        Boolean bool = false;
        String filein = newstr+"\r\n";//��д����У�����
        String temp  = "";
        
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//�ļ�·��(�����ļ�����)
            //���ļ�����������
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            
            //�ļ�ԭ������
            for(int i=0;(temp =br.readLine())!=null;i++){
                buffer.append(temp);
                // ������֮��ķָ��� �൱�ڡ�\n��
                buffer = buffer.append(System.getProperty("line.separator"));
            }
            buffer.append(filein);
            
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            //��Ҫ���ǹر�
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }
    
    /**
     * ɾ���ļ�
     * @param fileName �ļ�����
     * @return
     */
    public static boolean delFile(String fileName){
        Boolean bool = false;
        filenameTemp = path+fileName+".txt";
        File file  = new File(filenameTemp);
        try {
            if(file.exists()){
                file.delete();
                bool = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return bool;
    }

    private static void copyFileUsingApacheCommonsIO(File source, File dest) 
    	    throws IOException { 
    	  FileUtils.copyFile(source, dest); 
    	}
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        createFile(uuid+"myfile", "mid jfdsklaf fjdslkf1");
       // copyFileUsingApacheCommonsIO(filenameTemp, filenameTemp2);
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
}
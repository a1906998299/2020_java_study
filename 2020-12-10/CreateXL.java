import org.apache.poi.hssf.usermodel.HSSFWorkbook;
        import org.apache.poi.hssf.usermodel.HSSFSheet;
        import org.apache.poi.hssf.usermodel.HSSFRow;
        import org.apache.poi.hssf.usermodel.HSSFCell;
        import java.io.FileOutputStream;


public class CreateXL {
    /** Excel �ļ�Ҫ��ŵ�λ�ã��ٶ���F����*/
    public static String outputFile = "F:\\test.xls";
    public static void main(String argv[]) {
        try {
            // �����µ�Excel ������
            HSSFWorkbook workbook = new HSSFWorkbook();
            // ��Excel�������н�һ����������Ϊȱʡֵ
            // ��Ҫ�½�һ��Ϊ"Ч��ָ��"�Ĺ����������Ϊ��
            HSSFSheet sheet = workbook.createSheet("ѧ���ɼ�");
            // ������0��λ�ô����У���˵��У�
            HSSFRow row = sheet.createRow((short)0);
            //������0��λ�ô�����Ԫ�����϶ˣ�
            HSSFCell cell01 = row.createCell((short)0);
            HSSFCell cell02 = row.createCell((short)1);
            // �ڵ�Ԫ��������һЩ����
            cell01.setCellValue("��Ŀ");
            cell02.setCellValue("�ɼ�");
            //�����ϱߣ�д�ڶ���
            HSSFRow row1 = sheet.createRow((short)1);
            HSSFCell cell03 = row1.createCell((short)0);
            HSSFCell cell04 = row1.createCell((short)1);
            cell03.setCellValue("����");
            cell04.setCellValue("99");
            //������
            HSSFRow row2 = sheet.createRow((short)2);
            HSSFCell cell05 = row2.createCell((short)0);
            HSSFCell cell06 = row2.createCell((short)1);
            cell05.setCellValue("��ѧ");
            cell06.setCellValue("100");
            //������
            HSSFRow row3 = sheet.createRow((short)3);
            HSSFCell cell07 = row3.createCell((short)0);
            HSSFCell cell08 = row3.createCell((short)1);
            cell07.setCellValue("Ӣ��");
            cell08.setCellValue("90");

            // �½�һ����ļ���
            FileOutputStream fOut = new FileOutputStream(outputFile);
            // ����Ӧ��Excel ����������
            workbook.write(fOut);
            fOut.flush();
            // �����������ر��ļ�
            fOut.close();
            System.out.println("���ڲ���...");
        } catch (Exception e) {
            System.out.println("������xlCreate() : " + e);
        }
    }
}
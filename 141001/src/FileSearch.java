import java.io.File;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FileSearch extends JFrame{
 JComboBox<File> driveList = new JComboBox<File>();
 //JTable
 String title[] = {"목록","유형","수정일","크기"};
 Object data[][];
 DefaultTableModel dtm;
 JTable table;
 JScrollPane sp;
 
 public FileSearch(){
  super("파일탐색기");
  File[] list = File.listRoots();
  for(int i=0; i<list.length; i++){
   driveList.addItem(list[i]);
  }
  add(driveList, "North");
  //JTable
  File selectDrive = (File)driveList.getSelectedItem();
  //File selectDrive = new File("D:\\");
  //선택 드라이브의 폴더와 파일목록 얻기
  File fileLists[] = selectDrive.listFiles();
  data = new Object[fileLists.length][4];
  for(int cnt=0; cnt<fileLists.length; cnt++){
   if(fileLists[cnt].isFile()){//파일일때
    data[cnt][0] = fileLists[cnt].getName();
    data[cnt][1] = "[파일]";
    //수정일
    long time = fileLists[cnt].lastModified();//데이터 롱형으로 찍기
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(time);
    String date = cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+
      "-"+cal.get(Calendar.DATE);
    data[cnt][2] = date;
    //크기
    long fileSize = fileLists[cnt].length();
    String fileSizeResult="";
    if(fileSize>=(1024*1024*1024)){//1024 *1번 mbyte 2번 gbyte 3번 tbyte
     long mok = fileSize/(1024*1024*1024);
     long mod = fileSize%(1024*1024*1024);
     if(mod>0){ mok++; }
     fileSizeResult = mok + "GBytes";
    }else if(fileSize>=(1024*1024)){
     long mok = fileSize/(1024*1024);
     long mod = fileSize%(1024*1024);
     if(mod>0) mok++;
     fileSizeResult = mok + "MBytes";
    }else if(fileSize>=1024){
     long mok = fileSize/1024;
     long mod = fileSize%1024;
     if(mod>0) mok++;
     fileSizeResult = mok+"KBytes";
    }else{
     fileSizeResult = fileSize+"Bytes";
    }
    data[cnt][3] = fileSizeResult;    
    
   }else{//디렉토리(폴더)
    data[cnt][0] = fileLists[cnt].getPath();//cnt행에 0번째 방에
    data[cnt][1] = "[폴더]";
   }
  }
  dtm = new DefaultTableModel(data, title);
    table = new JTable(dtm);
    sp = new JScrollPane(table);
    add(sp, "Center");
    
  setSize(500, 500); setVisible(true);
 }
 public static void main(String[] args) {
  new FileSearch();
 }
 

} 



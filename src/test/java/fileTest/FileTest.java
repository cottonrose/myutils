package fileTest;

import com.bittech.util.FileUtil;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

/**
 * Auther:cottonrose
 * Created: ${date}
 */
public class FileTest {


    //判断是否为windows环境
    public  static void testIsWindows(){
        if(FileUtil.isWindows()) {
            System.out.println("这是windows环境");
        }else{
            System.out.println("这不是windows环境");
        }
    }

    //列出目录文件<br>
    public static void testLs(){
        //正常目录路径
        File[] files1 = FileUtil.ls("F:\\chengxulianxi");
        for(File file:files1){
            System.out.println(file);
        }
        //非正常目录路径（压缩包路径）
        File[] files2 = FileUtil.ls("F:\\chengxulianxi\\comment_convert");
        for(File file:files2){
            System.out.println(file);
        }
    }

    //目录是否为空
    public static void testDirIsEmpty(){
        //非空目录
        if(FileUtil.isDirEmpty(Paths.get("F:\\chengxulianxi"))){
            System.out.println("这是一个空目录");
        }else{
            System.out.println("这不是一个空目录");
        }
        //空目录
        if(FileUtil.isDirEmpty(Paths.get("F:\\chengxulianxi\\abc"))){
            System.out.println("这是一个空目录");
        }else{
            System.out.println("这不是一个空目录");
        }
    }

    //获取标准的绝对路径
    public static void testGetAbsPath(){
        //文件存在
        String str1 = FileUtil.getAbsolutePath(Paths.get("F:","chengxulianxi").toFile());
        System.out.println("str1: "+str1);
        //文件不存在
        String str2 = FileUtil.getAbsolutePath(Paths.get("F:","abc").toFile());
        System.out.println("str2: "+str2);
    }

    //检查给定路径是否已经是绝对路径
    public static void testIsAbsPath(){
        //绝对路径
        boolean tmp1 = FileUtil.isAbsolutePath(Paths.get("F:","chengxulianxi","java").toString());
        System.out.println(tmp1);
    }

    //递归遍历目录以及子目录中的所有文件<br>
    //如果提供file为文件，直接返回过滤结果
    public static void testLoopFiles(){
        String path = Paths.get("F:","chengxulianxi","abc").toString();
        System.out.println("0");
        List<File> files = FileUtil.loopFiles(path,File::isFile);
        System.out.println("2");
        for (File file:files){
            System.out.println(file);
        }
    }

    public static void main(String[] args){
        testLoopFiles();
    }

}

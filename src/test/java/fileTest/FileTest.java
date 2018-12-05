package fileTest;

import com.bittech.util.FileUtil;

import java.io.File;
import java.nio.file.Paths;

/**
 * Auther:cottonrose
 * Created: ${date}
 */
public class FileTest {


    //判断是否为windows环境
    public  static void code1(){
        if(FileUtil.isWindows()) {
            System.out.println("这是windows环境");
        }else{
            System.out.println("这不是windows环境");
        }
    }

    //列出目录文件<br>
    public static void code2(){
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
    public static void code3(){
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

    public static void main(String[] args){

    }

}

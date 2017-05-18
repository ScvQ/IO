package cn.spiderpig.io;

import java.io.File;

import cn.spiderpig.io.enmu.FileSuffixEnum;
import cn.spiderpig.io.filter.FileSuffixFilter;

public class Test {
    
    public static void main(String[] args){
        
        File file = new File("G://1.txt");
        FileSuffixFilter fsf = new FileSuffixFilter();
        if(fsf.accept(file.getParentFile(), file.getName())){
            System.out.println("成功");
        }else{
            System.out.println("不是txt文件");
        }
    }

}

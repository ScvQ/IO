package cn.spiderpig.io.filter;

import java.io.File;
import java.io.FilenameFilter;

import cn.spiderpig.io.enmu.FileSuffixEnum;

public class FileSuffixFilter implements FilenameFilter {

    public boolean accept(File dir, String fileName) {
        String suffix = FileSuffixEnum.TXT.toString();
        File file = new File(dir, fileName);
        return file.isDirectory() || file.isFile() && fileName.toUpperCase().endsWith(suffix);
    }

}

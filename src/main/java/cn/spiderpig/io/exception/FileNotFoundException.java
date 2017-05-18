package cn.spiderpig.io.exception;

@SuppressWarnings("serial")
public class FileNotFoundException extends RuntimeException {

    public FileNotFoundException(String absolutePath) {
        super(String.format("%s未找到", absolutePath));
    }

}

//zad. 67

package exception;

import javax.xml.crypto.Data;

public class DataExportException extends RuntimeException {
    public DataExportException(String message){
        super(message);
    }
}

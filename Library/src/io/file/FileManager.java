//zad. 67

package io.file;

import model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}

package lesson_02.ex006.Interface;

import lesson_02.ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

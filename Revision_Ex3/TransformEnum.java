package Revision_Ex3;

public class TransformEnum {

    public static String TransformEnum(String text) {
        text.replace('é', 'e');
        text.replace('è', 'e');
        text.replace('ê', 'e');
        text.replace('î', 'i');
        text.replace('ï', 'i');
        text.replace('-', '');
        text.replace('é', 'e');

        return text.toUpperCase();
    }

    public static String removeAccent(String text) {
        text = java.text.Normalizer.normalize(text, java.text.Normalizer.Form.NFD);
        return text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }
}

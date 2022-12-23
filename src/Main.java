public class Main {
    public static void main(String[] args){
        Pokemon nyaoha = new Pokemon();
        nyaoha.setName("ニャオハ");
        nyaoha.setType1("くさ");
        nyaoha.setLevel(5);

        System.out.println(nyaoha.getName() +"のレベルは"+ nyaoha.getLevel() + "です");
        System.out.println(nyaoha.getName()+ "は「" + nyaoha.getType1() + "」タイプです");

        nyaoha.setLevel(16);
        System.out.println(nyaoha.getName() + "は 16 にレベルアップしました");
        nyaoha.setName("ニャローテ");
        System.out.println(nyaoha.getName() + "に進化しました" );
        System.out.println(nyaoha.getName()+ "は「" + nyaoha.getType1() + "」タイプです");

        nyaoha.setLevel(36);
        System.out.println(nyaoha.getName() + "は 36 にレベルアップしました");
        nyaoha.setName("マスカーニャ");
        nyaoha.setType2("あく");
        System.out.println(nyaoha.getName() + "に進化しました");
        System.out.println(nyaoha.getName() + "は「" + nyaoha.getType1() + "/" + nyaoha.getType2() + "」タイプです");
    }
}

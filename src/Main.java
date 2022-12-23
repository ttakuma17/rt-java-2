public class Main {
    public static void main(String[] args){
        Pokemon nyaoha = new Pokemon();
        nyaoha.setName("ニャオハ");
        nyaoha.setType1("くさ");
        nyaoha.setLevel(5);

        System.out.println(nyaoha.getName() +"のレベルは"+ nyaoha.getLevel() + "です");
        System.out.println(nyaoha.getName()+ "は「" + nyaoha.getType1() + "」タイプです");

        // 5レベルから15まで繰り返し処理でレベルアップ
        for(int i=0; i<10; i++){
            nyaoha.setLevel(nyaoha.getLevel() + 1);
            System.out.println(nyaoha.getName() +"のレベルは"+ nyaoha.getLevel() + "になりました");
        }

        nyaoha.setLevel(16);
        System.out.println(nyaoha.getName() + "は 16 にレベルアップしました。おや..... ?");
        System.out.println("・");
        System.out.println("・");
        System.out.println("・");
        nyaoha.setName("ニャローテ");
        System.out.println(nyaoha.getName() + "に進化しました" );
        System.out.println(nyaoha.getName()+ "は「" + nyaoha.getType1() + "」タイプです");

        for (int i=0; i<19; i++){
            nyaoha.setLevel(nyaoha.getLevel() + 1);
            System.out.println(nyaoha.getName() +"のレベルは"+ nyaoha.getLevel() + "になりました");
        }

        nyaoha.setLevel(36);
        System.out.println(nyaoha.getName() + "は 36 にレベルアップしました。おや..... ?");
        System.out.println("・");
        System.out.println("・");
        System.out.println("・");
        nyaoha.setName("マスカーニャ");
        nyaoha.setType2("あく");
        System.out.println(nyaoha.getName() + "に進化しました");
        System.out.println(nyaoha.getName() + "は「" + nyaoha.getType1() + "/" + nyaoha.getType2() + "」タイプです");
    }
}

public class Main {
    public static void main(String[] args){
        Pokemon nyaoha = new Pokemon();
        nyaoha.setName("ニャオハ");
        nyaoha.setType1("くさ");
        nyaoha.setLevel(5);

        System.out.println(nyaoha.getName() +"のレベルは"+ nyaoha.getLevel() + "です");
        System.out.println(nyaoha.getName()+ "は「" + nyaoha.getType1() + "」タイプです");

        nyaoha.setLevel(16);

        if(nyaoha.getLevel() == 16){
            System.out.println(nyaoha.getName() + "は 16 にレベルアップしました");
            nyaoha.setName("ニャローテ");
            System.out.println(nyaoha.getName() + "に進化しました" );
            System.out.println(nyaoha.getName()+ "は「" + nyaoha.getType1() + "」タイプです");
        }else{
            System.out.println(nyaoha.getName() + "は進化をキャンセルしました。");
        }

        if(nyaoha.getName().equals("マスカーニャ")){
            System.out.println("最終進化系です！レベルをあげて新しい技を覚えましょう!");
        }else{
            System.out.println("まだまだ進化できるかもしれません");
        }

        nyaoha.setLevel(36);
        System.out.println(nyaoha.getName() + "は 36 にレベルアップしました");
        nyaoha.setType2("あく");
        nyaoha.setName("マスカーニャ");

        System.out.println(nyaoha.getName() + "に進化しました");
        System.out.println(nyaoha.getName() + "は「" + nyaoha.getType1() + "/" + nyaoha.getType2() + "」タイプです");

    }
}

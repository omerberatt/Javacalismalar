
public class Main {
    public static void main(String[] args) {
     Character[] char_dizi = {'J','A','V','A'};
     Integer[] integer_dizi = {1,2,3,4,5};
     String[] string_dizi= {"Java","Python","Html","Css"};

     YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
     YazdirmaSinifi<Integer> integer_yazdir = new YazdirmaSinifi<Integer>();
     YazdirmaSinifi<String> string_yazdir = new YazdirmaSinifi<String>();

     yazdir_char.yazdir(char_dizi);
     integer_yazdir.yazdir(integer_dizi);
     string_yazdir.yazdir(string_dizi);



    }
}
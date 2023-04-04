package ExerciseAssociativeArrays;
import java.util.*;
public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new LinkedHashMap<>();// създавам с LinkedHashMap за да ми се запази реда в който ги въвеждам
        keyMaterials.put("shards", 0);//към мап записа keyMaterials , добавям нов запис "shards", с value "0" още преди да прочета вх.данни
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junkMaterials = new LinkedHashMap<>();

        boolean isWin = false;
        while(!isWin) {
            String input = scanner.nextLine().toLowerCase();
            String[] inputArr = input.split( " " );
            for (int index = 0; index <= inputArr.length -1; index += 2) {
                int quantity = Integer.parseInt( inputArr[index] );
                String material = inputArr[index + 1];

                if (material.equals( "shards" ) || material.equals( "fragments" ) || material.equals( "motes" )) {
                    //валиден материал
                    int currentQuantity = keyMaterials.get( material );
                    keyMaterials.put( material, currentQuantity + quantity );
                } else {
                    //материала е боклук
                    if (!junkMaterials.containsKey( material )) {
                        junkMaterials.put( material, quantity );
                    } else {
                        int currentQuantity = junkMaterials.get( material );
                        junkMaterials.put( material, currentQuantity + quantity );
                    }
                }
                //проверка дали не сме спечелили след получаване на всеки един материал
                if (keyMaterials.get( "shards" ) >= 250) {
                    System.out.println( "Shadowmourne obtained!" );
                    keyMaterials.put( "shards", keyMaterials.get( "shards" ) - 250 );
                    isWin = true;
                    break;
                } else if (keyMaterials.get( "fragments" ) >= 250) {
                    System.out.println( "Valanyr obtained!" );
                    keyMaterials.put( "fragments", keyMaterials.get( "fragments" ) - 250 );
                    isWin = true;
                    break;
                } else if (keyMaterials.get( "motes" ) >= 250) {
                    System.out.println( "Dragonwrath obtained!" );
                    keyMaterials.put( "motes", keyMaterials.get( "motes" ) - 250 );
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        keyMaterials.forEach(( key, value ) -> System.out.println(String.format("%s: %d", key, value)));
        junkMaterials.forEach( (key, value)-> System.out.println(String.format( "%s: %d", key, value )));
    }
}

package util;

import day0111.Board;
import day0111.Student;

// 배열을 사용할 때 도움이 될만한 메소드를 모아둔 ArrayUtil 클래스
public class ArrayUtil {
    // 1. int[]
    // A. size() : 현재 배열의 길이를 리턴해주는 메소드
    public static int size(int[] array){
        return array.length;
    }

    // B. isEmpty()
    public static boolean isEmpty(int[] array){
        return size(array) == 0;
    }

    // C. get() : 해당 배열에 특정 인덱스의 값을 리턴
    public static int get(int[] array, int index){
        return array[index];
    }

    // D. contains()
    public static boolean contains(int[] array, int element){
        for (int i = 0; i < array.length; i++){
            if(element == get(array, i)){
                return true;
            }
        }
        return false;
    }

    // E. indexOf() : 해당 배열에서 특정값이 어디에 있는지 확인
    public static int indexOf(int[] array, int element){
        for (int i = 0; i < size(array); i++){
            if (element == get(array, i)){
                return i;
            }
        }

        return -1;
    }

    // F. add()
    public static int[] add(int[] array, int element){
        int[] temp = new int[size(array) + 1];
        for (int i = 0; i < size(array); i++){
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;

        return temp;
    }

    // G. add() : index 번째 칸에 element 의 값을 넣고 그 이후의 값은 뒤로 밀어준다
    public static int[] add(int[] array, int index, int element){
        int[] temp = new int[size(array) + 1];
        for (int i = 0; i < index; i ++){
            temp[i] = get(array, i);
        }
        temp[index] = element;
        for (int i = index; i<size(array); i++){
            temp[i + 1] = get(array, i);

        }

        temp = new int[0];
        for (int i = 0; i < size(array);){
            if (i != index) {
                temp = add(temp, get(array, i));
                i++;
            } else {
                temp = add(temp, element);
            }
        }

        return temp;
    }

    // H. set()
    public static int set(int[] array, int index, int element){
        int original = get(array, index);
        array[index] = element;

        return original;
    }

    // I. removeByIndex() 인덱스 기준 삭제
    public static int[] remove(int[] array, int index){
        int[] temp = new int[0];
        for (int i = 0; i < size(array); i++){
            if (i != index){
                temp = add(temp, get(array, i));
            }
        }
        return temp;
    }

    // J. removeByElement() 값 기준 삭제
    public static int[] removeByElement(int[] array, int element){
        return remove(array, indexOf(array, element));
    }

    // K. sort()
    public static void sort(int[] array){
        for(int i =0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i = -1;
            }
        }
    }

    // 2. Board[]
    // A. size()
    public static int size(Board[] array){
        return array.length;
    }

    // B. isEmpty()
    public static boolean isEmpty(Board[] array) {
        return size(array) == 0;
    }

    // C. get()
    public static Board get(Board[] array, int index){
        return array[index];
    }
    
    // D. contains()
    public static boolean contains(Board[] array, Board element){
        for (Board b : array){
            // 인덱스를 찾을 필요없는 경우 사용
            // array 길이가 변경되면 에러 발생
            // i 가 없어서 인덱스를 알수 없음
            if(element.equals(b)){
                return true;
            }
        }
        return false;
    }

    // E. indexOf()
    public static int indexOf(Board[] array, Board element){
        for (int i = 0; i < size(array); i++){
            if (element.equals(get(array, i))){
                return i;
            }
        }
        return -1;
    }

    // F. add()
    public static Board[] add(Board[] array, Board element){
        Board[] temp = new Board[size(array) + 1];
        for (int i = 0; i < size(array); i++){
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;

        return temp;
    }

    // G. add()
    public static Board[] add(Board[] array, int index, Board element){
        Board[] temp = new Board[0];
        for (int i = 0; i < size(array);){
            if(i != index) {
                temp = add(temp, get(array,i));
                i++;
            } else {
                temp = add(temp, element);
            }
        }

        return temp;
    }

    // H. set()
    public static Board set(Board[] array, int index, Board element){
        Board original = get(array, index);
        array[index] = element;

        return original;
    }

    // I. remove()
    public static Board[] remove(Board[] array, int index){
        Board[] temp = new Board[0];
        for (int i = 0; i < size(array); i++){
            if (i != index){
                temp = add(temp, get(array, i));
            }
        }
        return temp;
    }

    // J. remove()
    public static Board[] remove(Board[] array, Board element){
        return remove(array, indexOf(array, element));
    }


    // 3. Student[]
    // A. size()
    public static int size(Student[] array) {
        return array.length;
    }

    // B. isEmpty()
    public static boolean isEmpty(Student[] array) {
        return size(array) == 0;
    }

    // C. get()
    public static Student get(Student[] array, int index) {
        return array[index];
    }

    // D. contains()
    public static boolean contains(Student[] array, Student element){
        for (Student b : array){
            // 인덱스를 찾을 필요없는 경우 사용
            // array 길이가 변경되면 에러 발생
            // i 가 없어서 인덱스를 알수 없음
            if(element.equals(b)){
                return true;
            }
        }
        return false;
    }

    // E. indexOf()
    public static int indexOf(Student[] array, Student element){
        for (int i = 0; i < size(array); i++){
            if (element.equals(get(array, i))){
                return i;
            }
        }
        return -1;
    }

    // F. add()
    public static Student[] add(Student[] array, Student element){
        Student[] temp = new Student[size(array) + 1];
        for (int i = 0; i < size(array); i++){
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;

        return temp;
    }

    // G. add()
    public static Student[] add(Student[] array, int index, Student element){
        Student[] temp = new Student[0];
        for (int i = 0; i < size(array);){
            if(i != index) {
                temp = add(temp, get(array,i));
                i++;
            } else {
                temp = add(temp, element);
            }
        }

        return temp;
    }

    // H. set()
    public static Student set(Student[] array, int index, Student element){
        Student original = get(array, index);
        array[index] = element;

        return original;
    }
    // I. remove()
    public static Student[] remove(Student[] array, int index){
        Student[] temp = new Student[0];
        for (int i = 0; i < size(array); i++){
            if (i != index){
                temp = add(temp, get(array, i));
            }
        }
        return temp;
    }

    // J. remove()
    public static Student[] remove(Student[] array, Student element){
        return remove(array, indexOf(array, element));
    }


}

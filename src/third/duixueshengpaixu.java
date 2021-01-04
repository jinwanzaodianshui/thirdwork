package third;
import java.util.Scanner;
public class duixueshengpaixu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] piace =new float[5];
		String[] name = new String[5];
		for(int i=0;i<5;i++){
			System.out.println("请输入学生姓名：");
			name[i] = input.next();
			System.out.println("请输入他的成绩：");
			piace[i] = input.nextFloat();
		}
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(piace[i]<piace[j]){
					float tmp = piace[i];
					piace[i] = piace[j];
					piace[j] = tmp;
					
					String tmp1 = name[i];
					name[i] = name[j];
					name[j] = tmp1;
				}
			}
		}
		for(int i=0;i<5;i++){
			System.out.println(name[i]);
        }
	}
}

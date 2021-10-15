public class Salary {


    int getSum(Employee[] employeeArray){
int count = 0;
for (int i=0; i< employeeArray.length; i++){
    count = count + employeeArray[i].salary;
}
        return count;

    }


}

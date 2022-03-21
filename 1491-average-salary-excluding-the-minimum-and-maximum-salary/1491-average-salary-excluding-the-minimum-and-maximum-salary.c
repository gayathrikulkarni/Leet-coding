

double average(int* salary, int salarySize){
    int max=salary[0];
    int min=salary[0];
    
    for (int i=1; i<salarySize; i++){
        if(max<salary[i]){
            max = salary[i];
            
        }
        else if(min>salary[i]){
            min=salary[i];
            
        }
    }
    
    double sum = 0;
    for (int i = 0; i< salarySize; i++){
        
        if(salary[i] != max && salary[i] != min){
            sum = sum + salary[i];
        }
        
    }
    double average = sum/(salarySize-2);
        

    return average;

}
data<-c(1,2,3,4,5,6)
mean_value<-mean(data)
cat("The mean value is ",mean_value,"\n")

for(i in 1:5){
  cat("Iteration",i,"\n")
}



x<-1
while(x<=5){
  cat("Value of x",x,"\n")
  x<-x+1
}


x<-1
repeat{
  cat("Value of x",x,"\n")
  x<-x+1
  if(x>5){
    break
  }
}

for(i in 1:10){
  if(i==5){
    break
  }
  cat("i:",i,"\n")
}


for (i in 1:10){
  if(i%%2==0)next
  cat("odd number ",i,'\n')
}

name<-readline("Enter your name")
cat("hi",name,'\n')


choise<-6
switch (choise,
        "1"=cat("Option 1 is selected",'\n'),
        "2"=cat("Option 2 is selected",'\n'),
        "3"=cat("Option 3 is selected",'\n'),
        "4"=cat("Option 4 is selected",'\n'),
        "5"=cat("Option 5 is selected",'\n'),
        cat("Invalid option","\n")
)


greet<-function(){
  cat("Hellow World\n")}

greet()



factorial <- function(n) {
  if(n < 0){
    stop("Factorial not defined for negative numbers")
  } else {
    if(n == 0) {
      return(1)
    } else {
      result <- 1
      for(i in 1:n) {
        result <- result * i
      }
      return(result)
    }
  }
}








is_palindrome<-function(input){
  input<-as.character(input)
  reversed<-paste(rev(strsplit(input,"")[[1]]),collapse = "")
  return(input==reversed)
}

cat("Choose an option\n")
cat("1.Factorial\n")
cat("2.pallindrome\n")

choise<-as.integer(readline("Enter your choise (1 or 2 )"))
if(choise==1){
  number<-as.integer(readline("Enter number n for factorial"))
  cat("Factorial  of ",number," is ",factorial(number),'\n')
}
if( choise==2){
  input<-readline("Enter string to check pallindrome:")
  if(is_palindrome(input)){
    cat(input,"is pallendrome")
  }
  else{
    cat(input,"is  not pallendrome")
  }
  
}

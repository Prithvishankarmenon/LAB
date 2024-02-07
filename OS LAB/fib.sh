echo "Enter the  limit for FIBONNACI Series"
read a
n1=0
n2=1
b=`expr $a - 3`
c=0
echo "Fibonnaci Series is"
echo $n1
echo $n2
while [ $c -le $b ]
do
sum=`expr $n1 + $n2`
echo $sum
n1=`expr $n2`
n2=`expr $sum`
c=`expr $c + 1`
done

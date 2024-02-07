echo "Enter first number"
read a
echo "Enter second number"
read b
if [ $a -ge $b ]
then
echo "Greatest is $a"
else
echo "Greatest is $b"
fi

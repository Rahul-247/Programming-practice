# Alternative to switch cases
# Hello if 1
# howdy if 2
# greetings if any thing else

def switch(number):
    if number == 1:
        print('Hello!')
    elif number == 2:
        print('Howdy!')
    else:
        print('Greetings!')

print('Write a number')
print(switch(input()))
    
        

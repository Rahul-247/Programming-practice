# Using sys import

import sys

while True:
    print('Type exit ot exit')
    response = input()
    if response == 'exit':
        sys.exit()
    print('You typed'+response+'.')

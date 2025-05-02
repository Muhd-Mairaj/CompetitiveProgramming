from sys import stdin, stdout

inputs = stdin.read().splitlines()
outputs = []

n = int(inputs[0]) # sample input: read an integer from the first line
a = map(int, inputs[1].split()) # sample input: read an array of elements separated by a space from the second line

outputs.append("Test")
outputs.append("1 2 3")

stdout.write('\n'.join(outputs)) # sample output: print each string in outputs separated by a new line
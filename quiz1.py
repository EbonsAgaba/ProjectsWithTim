print("Welcome to my computer quiz! ")
playing = input("Do you what to play ? ")

if playing.lower() != "yes":
    quit()

print("Okay! Let's play :) ")

score = 0
answer = input("what does CPU stand for ? ")
if answer.lower() == "central processing unit":
    print("You are correct!")
    score += 1
else:
    print("Incorrect! ")

answer = input("what does GPU stand for ? ")
if answer.lower() == "graphics processing unit":
    print("You are correct!")
    score += 1
else:
    print("Incorrect! ")

answer = input("what does RAM stand for ? ")
if answer.lower() == "random access memory":
    print("You are correct!")
    score += 1
else:
    print("Incorrect! ")

answer = input("what does ROM stand for ? ")
if answer.lower() == "read only memory":
    print("You are correct!")
    score += 1
else:
    print("Incorrect! ")

answer = input("what does PSU stand for ? ")
if answer.lower() == "power supply unit":
    print("You are correct!")
    score += 1
else:
    print("Incorrect! ")

print("You have got " + str(score) + " questions correct!")
print("You have got ", ((score / 5) * 100), "%")




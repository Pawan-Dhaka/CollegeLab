import turtle
import random

# Screen setup
screen = turtle.Screen()
screen.bgcolor("black")
screen.title("Python Turtle Painting")

# Turtle setup
t = turtle.Turtle()
t.speed(0)
t.width(2)

# Colors
colors = ["red", "blue", "cyan", "yellow", "orange", "purple", "pink", "green"]

# Flower pattern
for i in range(36):
    t.color(random.choice(colors))
    t.begin_fill()

    for j in range(2):
        t.circle(100, 60)
        t.left(120)

    t.end_fill()
    t.right(10)

# Center circle
t.penup()
t.goto(0, -50)
t.pendown()

t.color("white")
t.begin_fill()
t.circle(50)
t.end_fill()

# Add stars
t.penup()
for i in range(40):
    x = random.randint(-300, 300)
    y = random.randint(-250, 250)
    t.goto(x, y)
    t.dot(random.randint(2, 8), random.choice(colors))

# Hide turtle
t.hideturtle()

# Keep window open
turtle.done()

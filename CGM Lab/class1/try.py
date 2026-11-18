import turtle
import math

screen = turtle.Screen()
screen.bgcolor("black")
t = turtle.Turtle()
t.speed(0)
# t.hideturtle()
# t.pensize(1)
# colors = ["pink", "red", "green", "blue"]
t.penup()
t.goto(0, 40)
t.color("red")
t.begin_fill()
for i in range(60):
    t.penup()
    angle = i * (math.pi * 2) / 120
    x = 16 * (math.sin(angle) ** 3) * 15
    y = (
        13 * math.cos(angle)
        - 5 * math.cos(2 * angle)
        - 2 * math.cos(3 * angle)
        - math.cos(4 * angle)
    ) * 15

    # t.color("white")
    t.pendown()
    t.goto(x, y)


t.right(-110)
t.forward(60)
t.right(70)
t.forward(50)
t.right(-100)
t.forward(70)
t.right(90)
t.forward(80)
t.right(-90)
t.forward(60)
t.right(120)
t.forward(70)
t.goto(0, 40)
t.end_fill()


turtle.done()

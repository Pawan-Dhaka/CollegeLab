import turtle
import math

screen = turtle.Screen()
t = turtle.Turtle()
t.pendown()
t.goto(0, 0)
t.forward(300)
t.goto(0, 0)
t.right(90)
t.forward(300)
t.goto(0, 0)
t.right(90)
t.forward(300)
t.goto(0, 0)
t.right(90)
t.forward(300)
t.goto(0, 0)
t.right(90)


def trans(x1, y1, x2, y2, tx, ty):
    t.penup()
    t.goto(x1, y1)
    t.pendown()
    t.goto(x2, y2)
    t.write("Old Line")
    t.penup()

    x1 += tx
    x2 += tx
    y1 += ty
    y2 += ty

    t.goto(x1, y1)
    t.pendown()
    t.goto(x2, y2)
    t.write("New Line")
    t.penup()


def scale(x1, y1, x2, y2, tx, ty):
    t.penup()
    t.goto(x1, y1)
    t.pendown()
    t.goto(x2, y2)
    t.write("Old Line")
    t.penup()

    x1 *= tx
    x2 *= tx
    y1 *= ty
    y2 *= ty

    t.goto(x1, y1)
    t.pendown()
    t.goto(x2, y2)
    t.write("New Line")
    t.penup()


def sch(x1, y1, x2, y2, tx, ty):
    t.penup()
    t.goto(x1, y1)
    t.pendown()
    t.goto(x2, y2)
    t.write("Old Line")
    t.penup()

    xa = x1 + tx * y1
    xb = x2 + tx * y2
    ya = y1 + ty * x1
    yb = y2 + ty * x2

    t.goto(xa, ya)
    t.pendown()
    t.goto(xb, yb)
    t.write("New Line")
    t.penup()


def ref(x1, y1, x2, y2, axix):
    t.penup()
    t.goto(x1, y1)
    t.pendown()
    t.goto(x2, y2)
    t.write("Old Line")
    t.penup()

    if axix == "x":
        xa = x1
        xb = x2
        ya = -y1
        yb = -y2

    if axix == "y":
        xa = -x1
        xb = -x2
        ya = y1
        yb = y2

    t.goto(xa, ya)
    t.pendown()
    t.goto(xb, yb)
    t.write("New Line")
    t.penup()


def rot(x1, y1, x2, y2, angle):
    t.penup()
    t.goto(x1, y1)
    t.pendown()
    t.goto(x2, y2)
    t.write("Old Line")
    t.penup()

    xa = x1
    xb = x2 * math.cos(math.radians(angle)) - y2 * math.sin(math.radians(angle))
    ya = y1
    yb = x2 * math.cos(math.radians(angle)) + y2 * math.sin(math.radians(angle))

    t.goto(xa, ya)
    t.pendown()
    t.goto(xb, yb)
    t.write("New Line")
    t.penup()


choice = int(input("""1. Translation
2. Scaling
3. Rotation
4. Reflection
5. Shearing
Enter your choice: """))

match choice:
    case 1:
        trans(30, 30, 90, 95, 20, -40)

    case 2:
        scale(30, 30, 90, 95, 1, 2)

    case 3:
        rot(30, 30, 90, 95, 30)
    case 4:

        ref(30, 30, 90, 95, "x")

    case 5:
        sch(30, 30, 90, 95, 1, 2)

    case _:
        print("Invalid choice")


turtle.done()

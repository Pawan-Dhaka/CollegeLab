import turtle

screen = turtle.Screen()
t = turtle.Turtle()


def draw_circle(r):
    x = 0
    y = r
    d = 3 - 2 * r
    t.penup()
    t.goto(x, y)
    t.pendown()
    while x <= y:
        points = [
            (x, y),
            (-x, y),
            (x, -y),
            (-x, -y),
            (y, x),
            (-y, x),
            (y, -x),
            (-y, -x),
        ]
        for px, py in points:
            t.penup()
            t.goto(px, py)
            t.dot(2)
            
        if d < 0:
            x = x + 1
            d = d + 2 * x + 1
        else:
            x = x + 1
            y = y - 1
            d = d + 2 * x - 2 * y + 1


draw_circle(70)

turtle.done()

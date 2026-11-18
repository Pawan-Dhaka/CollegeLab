import turtle

t = turtle.Turtle()
t.speed(0)
#circle
# t.circle(100)

#line
# t.penup()
# t.goto(-45, 67)
# t.pendown()
# t.goto(189, 156)

#user input
# t.shape("turtle")
# rad1 = int(input("give me first radius"))
# rad2 = int(input("give me second radius"))

#ellipse
# t.circle(rad1, 90)
# t.circle(rad2, 90)
# t.circle(rad1, 90)
# t.circle(rad2, 90)


#all shapes
t.penup()
t.goto(0, 0)
t.pendown()
t.goto(0, 700)
t.goto(0, -700)
t.goto(0, 0)
t.goto(700, 0)
t.goto(-700, 0)


rad1 = -780
rad2 = -200
rad3 = 468
rad4 = 390

t.penup()
t.goto(rad1, rad2)
t.pendown()
t.goto(rad3, rad4)

t.penup()
t.goto(-200, 200)
t.pendown()
t.circle(100)


t.penup()
t.goto(200, -200)
t.pendown()

t.circle(rad1, 90)
t.circle(rad2, 90)
t.circle(rad1, 90)
t.circle(rad2, 90)


t.penup()
t.goto(0, 0)


turtle.done()
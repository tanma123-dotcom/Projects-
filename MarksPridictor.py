from sklearn.linear_model import LinearRegression #model input kiya
hours=[[1], [2], [3], [4], [5]] #ye humne ne input diya ki kitne hours h ise hum ne double brckit mai iss liye lekha kyki ye list of lists h aur input mai kitne bhe input ho sakte h jaise hours+IQ etc
marks=[40, 50, 60, 70, 80]#ye output h jisme hum model ko bata rahe h ki kitne hours padhne pe kitne marks aa rahe h jise 1 hour pe 30 or 2 hour pe 40 ye output mai humne double bracket isliye nai lagaya kyki output sirf ek he hoga isliye humne simple list banaya h
model= LinearRegression()#ab ye line se humne model nam ka ek model banaya h abhi iss modele ko kuch nai aata isse abhi humne train nai kiya niche vale line mai karenge 
model.fit(hours, marks)#ab is line se humne model ko data diya iss data ke hisab se model apne aap ko train kerega pattern analyze karega
hour1=int(input("enter the study hours:"))#ye line humne input lene ke liye likhi h
print("marks for",hour1,"hours:",model.predict([[hour1]])[0])
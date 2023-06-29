import json
from urllib import request

url = 'https://api.xor.cl/red/metro-network'
respuesta = request.urlopen(url)
#print(respuesta.read())
contenido = respuesta.read()
#print(contenido)
json_obtenido = json.loads(contenido.decode('utf-8'))
print(json_obtenido['api_status']+" "+ json_obtenido['time'])

for linea in json_obtenido['lines']:
    print("Linea")
    print("\n")
    print( linea['name'])
    print(linea['id'])
    print("\n\n")
    for estacion in linea['stations']:
        print("Estacion")
        print("\n")
        print(estacion['name'])
        print(estacion['id'])
        print(estacion['lines'])
        print("\n\n")

#new_string = json.dumps(linea)

#print(new_string)
   

    
    



        
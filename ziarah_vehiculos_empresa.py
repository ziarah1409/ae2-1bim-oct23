class Vehiculos:
    def __init__(self):
        self.vehiculos = []

    def insertar_vehiculo(self, placa, marca, modelo):
        vehiculo = {"placa": placa, "marca": marca, "modelo": modelo}
        self.vehiculos.append(vehiculo)

    def modificar_vehiculo(self, placa, marca, modelo):
        for vehiculo in self.vehiculos:
            if vehiculo["placa"] == placa:
                vehiculo["marca"] = marca
                vehiculo["modelo"] = modelo
                print(f"Veh�culo con placa {placa} modificado.")
                break
        else:
            print(f"No se encontr� ning�n veh�culo con la placa {placa}.")

    def mostrar_vehiculos(self):
        for index, vehiculo in enumerate(self.vehiculos, start=1):
            print(f"Veh�culo {index}: Placa: {vehiculo['placa']}, Marca: {vehiculo['marca']}, Modelo: {vehiculo['modelo']}")

    def eliminar_vehiculo(self, placa):
        for vehiculo in self.vehiculos:
            if vehiculo["placa"] == placa:
                self.vehiculos.remove(vehiculo)
                print(f"Veh�culo con placa {placa} eliminado.")
                break
        else:
            print(f"No se encontr� ning�n veh�culo con la placa {placa}.")

class Empresa:
    def __init__(self):
        self.empresas = []

    def insertar_empresa(self, nombre, direccion, telefono):
        empresa = {"nombre": nombre, "direccion": direccion, "telefono": telefono}
        self.empresas.append(empresa)

    def modificar_empresa(self, nombre, direccion, telefono):
        for empresa in self.empresas:
            if empresa["nombre"] == nombre:
                empresa["direccion"] = direccion
                empresa["telefono"] = telefono
                print(f"Empresa {nombre} modificada.")
                break
        else:
            print(f"No se encontr� ninguna empresa con el nombre {nombre}.")

    def mostrar_empresas(self):
        for index, empresa in enumerate(self.empresas, start=1):
            print(f"Empresa {index}: Nombre: {empresa['nombre']}, Direcci�n: {empresa['direccion']}, Tel�fono: {empresa['telefono']}")

    def eliminar_empresa(self, nombre):
        for empresa in self.empresas:
            if empresa["nombre"] == nombre:
                self.empresas.remove(empresa)
                print(f"Empresa {nombre} eliminada.")
                break
        else:
            print(f"No se encontr� ninguna empresa con el nombre {nombre}.")

def main():
    vehiculos_manager = Vehiculos()
    empresa_manager = Empresa()

    while True:
        print("\nMen�:")
        print("1. Interactuar con Veh�culos")
        print("2. Interactuar con Empresas")
        print("3. Salir")

        choice = input("Seleccione una opci�n: ")

        if choice == "1":
            sub_menu_vehiculos(vehiculos_manager)
        elif choice == "2":
            sub_menu_empresas(empresa_manager)
        elif choice == "3":
            break
        else:
            print("Opci�n no v�lida. Por favor, elija una opci�n v�lida.")

def sub_menu_vehiculos(vehiculos_manager):
    while True:
        print("\nMen� Veh�culos:")
        print("1. Insertar Veh�culo")
        print("2. Modificar Veh�culo")
        print("3. Mostrar Veh�culos")
        print("4. Eliminar Veh�culo")
        print("5. Regresar al men� principal")

        choice = input("Seleccione una opci�n: ")

        if choice == "1":
            placa = input("Ingrese la placa del veh�culo: ")
            marca = input("Ingrese la marca del veh�culo: ")
            modelo = input("Ingrese el modelo del veh�culo: ")
            vehiculos_manager.insertar_vehiculo(placa, marca, modelo)
        elif choice == "2":
            placa = input("Ingrese la placa del veh�culo a modificar: ")
            marca = input("Ingrese la nueva marca: ")
            modelo = input("Ingrese el nuevo modelo: ")
            vehiculos_manager.modificar_vehiculo(placa, marca, modelo)
        elif choice == "3":
            vehiculos_manager.mostrar_vehiculos()
        elif choice == "4":
            placa = input("Ingrese la placa del veh�culo a eliminar: ")
            vehiculos_manager.eliminar_vehiculo(placa)
        elif choice == "5":
            break
        else:
            print("Opci�n no v�lida. Por favor, elija una opci�n v�lida.")

def sub_menu_empresas(empresa_manager):
    while True:
        print("\nMen� Empresas:")
        print("1. Insertar Empresa")
        print("2. Modificar Empresa")
        print("3. Mostrar Empresas")
        print("4. Eliminar Empresa")
        print("5. Regresar al men� principal")

        choice = input("Seleccione una opci�n: ")

        if choice == "1":
            nombre = input("Ingrese el nombre de la empresa: ")
            direccion = input("Ingrese la direcci�n de la empresa: ")
            telefono = input("Ingrese el tel�fono de la empresa: ")
            empresa_manager.insertar_empresa(nombre, direccion, telefono)
        elif choice == "2":
            nombre = input("Ingrese el nombre de la empresa a modificar: ")
            direccion = input("Ingrese la nueva direcci�n: ")
            telefono = input("Ingrese el nuevo tel�fono: ")
            empresa_manager.modificar_empresa(nombre, direccion, telefono)
        elif choice == "3":
            empresa_manager.mostrar_empresas()
        elif choice == "4":
            nombre = input("Ingrese el nombre de la empresa a eliminar: ")
            empresa_manager.eliminar_empresa(nombre)
        elif choice == "5":
            break
        else:
            print("Opci�n no v�lida. Por favor, elija una opci�n v�lida.")

if __name__ == "__main__":
    main()

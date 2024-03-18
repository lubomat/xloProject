// Pobranie listy pojazdów z backendu
function getVehicles() {
    fetch('/vehicles')
        .then(response => response.json())
        .then(data => {
            // Wyświetlenie pojazdów na stronie
            displayVehicles(data);
        })
        .catch(error => {
            console.error('There was an error while fetching vehicles:', error);
        });
}

// Dodawanie nowego pojazdu
function addVehicle(vehicleData) {
    fetch('/vehicles/create', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(vehicleData)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            alert('Vehicle added successfully!');
            getVehicles(); // Odświeżenie listy pojazdów po dodaniu nowego
        })
        .catch(error => {
            console.error('There was an error while adding vehicle:', error);
            alert('Error: Vehicle could not be added');
        });
}

// Wyświetlenie listy pojazdów na stronie
function displayVehicles(vehicles) {
    const vehicleList = document.getElementById('vehicle-list');
    vehicleList.innerHTML = ''; // Wyczyszczenie istniejącej listy

    vehicles.forEach(vehicle => {
        // Tworzenie elementów dla każdego pojazdu
        const listItem = document.createElement('li');
        listItem.textContent = `ID: ${vehicle.id}, Type: ${vehicle.type}, Description: ${vehicle.description}, Price: ${vehicle.price}`;

        // Dodanie pojazdu do listy
        vehicleList.appendChild(listItem);
    });
}

// Obsługa formularza dodawania pojazdu
document.getElementById('vehicleForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const formData = new FormData(this);
    const vehicleData = {};
    formData.forEach((value, key) => {
        vehicleData[key] = value;
    });

    // Wywołanie funkcji do dodawania pojazdu
    addVehicle(vehicleData);
});

// Wywołanie funkcji getVehicles() po załadowaniu strony
document.addEventListener('DOMContentLoaded', () => {
    getVehicles();
});

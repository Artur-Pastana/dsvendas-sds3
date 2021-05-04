import Chart from 'react-apexcharts';
const BarChart = () => {

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories: ['Viuva Negra', 'Namikase', 'Wanda', 'Logan', 'Basculho']
        },
        series: [
            {
                name: "% Personagens",
                data: [43.6, 67.1, 67.7, 45.6, 71.1]
            }
        ]
    };
    return (
        <Chart 
            options={{...options, xaxis: mockData.labels}}
            series={mockData.series}
            type="bar"
            height="250"
        />
    );
}

export default BarChart;
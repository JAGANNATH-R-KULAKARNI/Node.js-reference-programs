const express = require('express');

const app = express();


app.use('/users', (req, res, next) => {
    console.log('/users middleware');
    res.send('<p>Hey! ,It is a middleware to handle the ?users</p>');
});

app.use('/', (req, res, next) => {
    console.log('/ middleware');
    res.send('<p>Hey ! It is The Middleware to handle "/"</p>');
});


app.listen(3000);
